DESCRIPTION = "Tool for creating supermin appliances (formerly called febootstrap)."

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI = "http://download.libguestfs.org/supermin/supermin-${PV}.tar.gz"
SRC_URI[md5sum] = "f9a6cb7fdd72c87a80fee909be827879"

# Make sure our source directory (for the build) matches the directory structure in the tarball
S = "${WORKDIR}/supermin-${PV}"


DEPENDS = " \
    bash \
    glibc \
    gawk \
    thrift \
"

RDEPENDS_${PN} = " \
    bash \
    glibc \
    gawk \
    thrift \
"

inherit autotools pkgconfig

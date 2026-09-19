SUMMARY = "Xen Virtualization: Headers and libraries for development"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
This package contains the libraries and header files needed to create \
tools to control virtual machines. \
 \
 \
 \
Authors: \
-------- \
    Ian Pratt <ian.pratt@cl.cam.ac.uk>"
LICENSE = "GPL-2.0-only"

PV = "4.22.0_04"

RPM_NAME = "xen-devel-4.22.0_04-1.1.aarch64.rpm"
RPM_HASH = "01a22ebea8d890966ab5751e959f040be9f6f4c99f87872e7d24e9021812f514b3fdab388c201ef36855f79436bfe29730d34a42c22faa4cce3898b85d654634"

RPROVIDES:${PN} += "pkgconfig-xencall \
pkgconfig-xencontrol \
pkgconfig-xendevicemodel \
pkgconfig-xenevtchn \
pkgconfig-xenforeignmemory \
pkgconfig-xengnttab \
pkgconfig-xenguest \
pkgconfig-xenhypfs \
pkgconfig-xenlight \
pkgconfig-xenmanage \
pkgconfig-xenstat \
pkgconfig-xenstore \
pkgconfig-xentoolcore \
pkgconfig-xentoollog \
pkgconfig-xenvchan \
pkgconfig-xlutil \
xen-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuuid-devel \
pkgconfig-xencall \
pkgconfig-xencontrol \
pkgconfig-xendevicemodel \
pkgconfig-xenevtchn \
pkgconfig-xenforeignmemory \
pkgconfig-xengnttab \
pkgconfig-xenguest \
pkgconfig-xenhypfs \
pkgconfig-xenlight \
pkgconfig-xenstore \
pkgconfig-xentoolcore \
pkgconfig-xentoollog \
xen-libs"

inherit rpm

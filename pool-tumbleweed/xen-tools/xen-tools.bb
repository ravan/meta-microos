SUMMARY = "Xen Virtualization: Control tools for domain 0"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
This package contains the control tools that allow you to start, stop, \
migrate, and manage virtual machines. \
 \
In addition to this package you need to install xen and xen-libs \
to use Xen. \
 \
 \
Authors: \
-------- \
    Ian Pratt <ian.pratt@cl.cam.ac.uk>"
LICENSE = "GPL-2.0-only"

PV = "4.22.0_04"

RPM_NAME = "xen-tools-4.22.0_04-1.1.aarch64.rpm"
RPM_HASH = "a420410232758e975ba990f51af1df971eff40a496f9df83feb2f0e268f08e39c40a2c1d70cebd9d5f42b44f2ee4dde3d47a19e54b65e9188e1badfc0b0daba1"

RPROVIDES:${PN} += "config-xen-tools \
xen-tools \
xen-tools-ioemu"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6 \
libxenctrl.so.4.22 \
libxenevtchn.so.1 \
libxenforeignmemory.so.1 \
libxenfsimage.so.4.22 \
libxengnttab.so.1 \
libxenguest.so.4.22 \
libxenhypfs.so.1 \
libxenlight.so.4.22 \
libxenmanage.so.1 \
libxenstat.so.4.22 \
libxenstore.so.4 \
libxentoollog.so.1 \
libxenvchan.so.4.22 \
libxlutil.so.4.22 \
libyajl.so.2 \
python-abi \
python313 \
python313-curses \
qemu-arm \
xen \
xen-libs"

inherit rpm

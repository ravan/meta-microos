SUMMARY = "Xen Virtualization: Libraries"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
This package contains the libraries used to interact with the Xen \
virtual machine monitor. \
 \
In addition to this package you need to install xen and xen-tools \
to use Xen. \
 \
 \
Authors: \
-------- \
    Ian Pratt <ian.pratt@cl.cam.ac.uk>"
LICENSE = "GPL-2.0-only"

PV = "4.22.0_04"

RPM_NAME = "xen-libs-4.22.0_04-1.1.aarch64.rpm"
RPM_HASH = "af11138859f442b0c67c8a20e847b6ab2d2ca827b90e225e22520851a19a08a1d3ef9738ef3825e8da78d7bfc57991da25e19823e61a92e93abef6331a99c944"

RPROVIDES:${PN} += "libxencall.so.1 \
libxenctrl.so.4.22 \
libxendevicemodel.so.1 \
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
libxentoolcore.so.1 \
libxentoollog.so.1 \
libxenvchan.so.4.22 \
libxlutil.so.4.22 \
xen-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfdt.so.1 \
libnl-3.so.200 \
libnl-route-3.so.200 \
libuuid.so.1 \
libyajl.so.2 \
libz.so.1"

inherit rpm

SUMMARY = "Xen Virtualization: HTML documentation"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
xen-doc-html contains the online documentation in HTML format. Point \
your browser at file:/usr/share/doc/packages/xen/html/ \
 \
 \
 \
Authors: \
-------- \
    Ian Pratt <ian.pratt@cl.cam.ac.uk>"
LICENSE = "GPL-2.0-only"

PV = "4.22.0_04"

RPM_NAME = "xen-doc-html-4.22.0_04-1.1.aarch64.rpm"
RPM_HASH = "5981e92f90a1fe9fe1e51e18bea62ad8eecbd8f286fe9a7024cf30cc47be35dd7237dc6eb40c703f63985d47b1c58d2dcb5590259176f78c16f6a690db7e65d8"

RPROVIDES:${PN} += "xen-doc-html"

RDEPENDS:${PN} += ""

inherit rpm

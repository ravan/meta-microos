SUMMARY = "Object Oriented Extension for Tcl"
DESCRIPTION = "Incr Tcl adds object-oriented programming facilities to Tcl.  It was \
NOT designed as another whiz-bang, object-oriented programming \
language. It is patterned somewhat after C++.  It was designed to \
support more structured programming in Tcl.  Scripts that grow beyond a \
few thousand lines become extremely difficult to maintain. [incr Tcl] \
attacks this problem in the same way that any object- oriented \
programming language would, by providing mechanisms for data \
encapsulation behind well-defined interfaces. \
 \
 \
 \
Authors: \
-------- \
    Michael J. McLennan <michael.mclennan@att.com> \
    Dr. John Ousterhout <john.ousterhout@eng.sun.com>"
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "itk-4.1.0-2.27.aarch64.rpm"
RPM_HASH = "c2056544e03235b0495713aad0db7094b61e8bceb4d199480c1407514004491ed730864bacb8df2cb00a6dfe667e86efeed6197636712d70b02971395ebb53ad"

RPROVIDES:${PN} += "itcl-/usr/share/man/mann/itk.n.gz \
itk \
libitk4.1.0.so"

RDEPENDS:${PN} += "itcl \
ld-linux-aarch64.so.1 \
libc.so.6 \
tcl \
tk"

inherit rpm

SUMMARY = "A small embeddable Tcl interpreter"
DESCRIPTION = "Jim is an opensource small-footprint implementation of the Tcl programming \
language. It implements a large subset of Tcl and adds new features like \
references with garbage collection, closures, built-in Object Oriented \
Programming system, Functional Programming commands, first-class arrays and \
UTF-8 support."
LICENSE = "BSD-2-Clause"

PV = "0.82"

RPM_NAME = "jimtcl-0.82-1.11.aarch64.rpm"
RPM_HASH = "a8ed1fd2da761611866a0fb70762ae527b6f1643908cef754680e856ea0be7e012786f32bf46c74ff9a7157c3e16e7e6c76132af3496126f80bb748d19b61ec1"

RPROVIDES:${PN} += "jimtcl"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjim.so.0.82"

inherit rpm

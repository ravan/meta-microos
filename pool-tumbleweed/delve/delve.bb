SUMMARY = "Debugger for the Go Programming Language"
DESCRIPTION = "Delve is a debugger for the Go programming language. The goal of \
the project is to provide a simple, full featured debugging tool \
for Go. Delve should be easy to invoke and easy to use. Chances are \
if you're using a debugger, things aren't going your way. With that \
in mind, Delve should stay out of your way as much as possible."
LICENSE = "MIT"

PV = "1.27.2"

RPM_NAME = "delve-1.27.2-1.1.aarch64.rpm"
RPM_HASH = "07407cb5f4e1c9371ea20511bcc2e02d65f81cbb830f6cd64dca658c1746847a810c2af77a4bcd822a18a46e8bd352fb399a4c898bdad10609f2f1e936e97e20"

RPROVIDES:${PN} += "delve"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

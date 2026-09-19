SUMMARY = "Source Code Indenter, Formatter, and Beautifier for C, C++, C# and Java"
DESCRIPTION = "Artistic Style is a source code indenter, formatter, and beautifier for the C, \
C++, C# and Java programming languages. It automatically re-indents and \
re-formats C / C++ / C# / Java source files. It can be used from a command \
line, or it can be incorporated as classes in another C++ program."
LICENSE = "MIT"

PV = "3.6.14"

RPM_NAME = "astyle-3.6.14-1.3.aarch64.rpm"
RPM_HASH = "961bc6304785c1bf64704e324653eb219731b59520cdfa2f9089b87946e2838eef36c5f485369643e437272234ffb9a76c0e266512ddc040799fcfe066138c79"

RPROVIDES:${PN} += "astyle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

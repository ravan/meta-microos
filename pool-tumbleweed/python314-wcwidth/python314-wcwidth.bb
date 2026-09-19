SUMMARY = "Number of Terminal column cells of wide-character codes"
DESCRIPTION = "This API is mainly for Terminal Emulator implementors -- any python \
program that attempts to determine the printable width of a string on \
a Terminal. It is implemented in python (no C library calls) and has \
no 3rd-party dependencies. \
 \
It is certainly possible to use your Operating System's wcwidth(3) \
and wcswidth(3) calls if it is POSIX-conforming, but this would not \
be possible on non-POSIX platforms, such as Windows, or for \
alternative Python implementations, such as jython.  It is also \
commonly many releases older than the most current Unicode Standard \
release files, which this project aims to track."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python314-wcwidth-0.8.2-1.1.noarch.rpm"
RPM_HASH = "38d5f2406d9e1cd77d6b5dbc76ffc29bd176eb58b0b8fd27b2943869b0e1732019665568646b423bbc5691283ec975468edb98dc3254f24e1fb15992b1f8b550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wcwidth \
python314-wcwidth \
python3dist-wcwidth"

RDEPENDS:${PN} += "python-abi"

inherit rpm

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

RPM_NAME = "python313-wcwidth-0.8.2-1.1.noarch.rpm"
RPM_HASH = "6324b6107c641b06df51dc65e3a57408cc32996078ed0e766840717f9c5070477da06065177e853049f9539f577abdc741612a4d861ecd169e5254ba1edff6d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wcwidth \
python3.13dist-wcwidth \
python313-wcwidth \
python3dist-wcwidth"

RDEPENDS:${PN} += "python-abi"

inherit rpm

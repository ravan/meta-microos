SUMMARY = "PerlIO layer that adds read & write timeout to a handle"
DESCRIPTION = "This package implements a PerlIO layer, that adds read / write timeout. \
This can be useful to avoid blocking while accessing a handle (file, \
socket, ...), and fail after some time. \
 \
The timeout is implemented by using '<select'> on the handle before \
reading/writing. \
 \
*WARNING* the handle won't timeout if you use 'sysread' or 'syswrite' on \
it, because these functions works at a lower level. However if you're \
trying to implement a timeout for a socket, see the IO::Socket::Timeout \
manpage that implements exactly that."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.32"

RPM_NAME = "perl-PerlIO-via-Timeout-0.32-1.40.noarch.rpm"
RPM_HASH = "ef23aedbc0bc0eb48dcb08669f3ecad6da72749ec348f669f89c78d7009a3e980d1a64f10df2ccc858edc010520794b03e7bde3426d3e4c6080c846db257854e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PerlIO--via--Timeout \
perl-PerlIO-via-Timeout"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm

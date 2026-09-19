SUMMARY = "Source code of jwt_verify_lib"
DESCRIPTION = "jwt_verify_lib is a library which verifies JSON Web Tokens. It does not provide \
any other features like signing or advanced checks. \
 \
This package contains source code of jwt_verify_lib."
LICENSE = "Apache-2.0"

PV = "20191024"

RPM_NAME = "jwt_verify_lib-source-20191024-1.17.noarch.rpm"
RPM_HASH = "234bcdcde9956abb03e0bd7310c5752094da091bf1f01c013107b2ca6492018ff0708662c796b2f2b6ea25c5c9e117cbce33ac611e89ceeae8b470703b09bf90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jwt-verify-lib-source"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

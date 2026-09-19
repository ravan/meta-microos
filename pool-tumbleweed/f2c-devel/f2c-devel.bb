SUMMARY = "Files for Developing with f2c"
DESCRIPTION = "This package uses an 'f77' script that hides the C translation process from the user."
LICENSE = "MIT"

PV = "20240504"

RPM_NAME = "f2c-devel-20240504-1.3.aarch64.rpm"
RPM_HASH = "93a6280862da66c5d5f93d127412440b60b18746b4578c84f6117800f7c6c4d56dfadc97bf05c9f97ac9af8e8c0d95cb5c011a3c2a3327c41c53613ce4b47362"

RPROVIDES:${PN} += "f2c-devel"

RDEPENDS:${PN} += "libf2c0"

inherit rpm

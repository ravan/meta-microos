SUMMARY = "A GitLab command line tool"
DESCRIPTION = "glab is a command line tool bringing GitLab's features to the command line."
LICENSE = "MIT"

PV = "1.115.0"

RPM_NAME = "glab-1.115.0-1.1.aarch64.rpm"
RPM_HASH = "e9f391fb7f1511d254230e73654b8a52320a62b0880e41fcb89dbfce5e4880a7182005015a780c103549b785ea35755032ae0563932675733d05513f1c301636"

RPROVIDES:${PN} += "glab"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

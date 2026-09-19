SUMMARY = "The error messages files required by server, client and libmariadbd"
DESCRIPTION = "This package provides translated error messages for the standalone \
server daemon, embedded server and client."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "12.3.2"

RPM_NAME = "mariadb-errormessages-12.3.2-1.3.noarch.rpm"
RPM_HASH = "4b42a73ef73f40b6037d1f839a614e0d1caf86ddddce927f48686b91f04462286b81ef45f96193745096d3aab03ba5f0f593601577e9251b7eb0ce091072d3cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mariadb-errormessages"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for Argon2"
DESCRIPTION = "Documentation for Argon2, the password hashing function that won the Password \
Hashing Competition (PHC) in 2015."
LICENSE = "Apache-2.0 | CC0-1.0"

PV = "20190702"

RPM_NAME = "argon2-doc-20190702-4.9.noarch.rpm"
RPM_HASH = "02f3e38ae20da8b13d0c7c7ff003f5b95c09a1fe8ea506c36a1b898c3de15f70559dda873054b3a0fc874ff7b1cd028d173d7aab0d53d14e4e07b4d38e0e595d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "argon2-doc"

RDEPENDS:${PN} += ""

inherit rpm

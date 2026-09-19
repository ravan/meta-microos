SUMMARY = "Python module to parse human-readable date/time text"
DESCRIPTION = "A Python module to parse human-readable date/time strings."
LICENSE = "Apache-2.0"

PV = "2.6"

RPM_NAME = "python314-parsedatetime-2.6-4.5.noarch.rpm"
RPM_HASH = "496fd9c8b48506021790c2501319598fadeeeb2ae46a7f369b84d7f1cd985513a9c4d25108b1ebb083bcb807daf089cbfc284bb59f0eabecfda06b2a80e0f13f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-parsedatetime \
python314-parsedatetime \
python3dist-parsedatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm

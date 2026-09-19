SUMMARY = "Python module to parse human-readable date/time text"
DESCRIPTION = "A Python module to parse human-readable date/time strings."
LICENSE = "Apache-2.0"

PV = "2.6"

RPM_NAME = "python313-parsedatetime-2.6-4.5.noarch.rpm"
RPM_HASH = "a9f13e4310fa1942b6ffe50a0c3558174efe918e565cb9345b84740efa9c03875ac90ce54dcce0efb3512e7e5e27ff4f79c6d9a998c9e1acc8dc31ce806b0709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parsedatetime \
python3.13dist-parsedatetime \
python313-parsedatetime \
python3dist-parsedatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm

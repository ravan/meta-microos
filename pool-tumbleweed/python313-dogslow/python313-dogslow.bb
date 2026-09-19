SUMMARY = "A Django middleware that logs tracebacks of slow requests"
DESCRIPTION = "A Django middleware that logs tracebacks of slow requests and allows further inspection."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "python313-dogslow-1.2-2.5.noarch.rpm"
RPM_HASH = "5f9fd5964b2da7db35fc1b63f7865e560107cc9b66a1fd25637fc01feb449f775aec10c13cbbbc8da43ab4f93c64920525c821e9c3ad4e403fcde2cd96c7c4b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dogslow \
python3.13dist-dogslow \
python313-dogslow \
python3dist-dogslow"

RDEPENDS:${PN} += "python-abi"

inherit rpm

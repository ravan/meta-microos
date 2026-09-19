SUMMARY = "Add JSON (de)serialization to your python objects"
DESCRIPTION = "Quickly add json serialization and deserialization \
to your python classes."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "python314-JsonWeb-0.8.2-7.5.noarch.rpm"
RPM_HASH = "1b68359a88d0adf0b30858a50577fa84de16155e095a6a1c08a038a70e173c7873aeeef339171aaa8ba9f3c0f38533f608df3196084c131b06c1659aa1b99d38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsonweb \
python314-JsonWeb \
python3dist-jsonweb"

RDEPENDS:${PN} += "python-abi"

inherit rpm

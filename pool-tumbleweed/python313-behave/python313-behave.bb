SUMMARY = "Behaviour-driven development, Python style"
DESCRIPTION = "Behavior-driven development (or BDD) is an agile software development \
technique that encourages collaboration between developers, QA and \
non-technical or business participants in a software project. \
 \
*behave* uses tests written in a natural language style, backed up by Python \
code."
LICENSE = "BSD-2-Clause"

PV = "1.3.3"

RPM_NAME = "python313-behave-1.3.3-2.4.noarch.rpm"
RPM_HASH = "4026d80c9d9f7c7ce8267cc7ab49ae6c9b61eb0702f92f2edf4ea11d4e6b16d50cb9644e4162e9d74c19e46c19788839849ba3f51ac119026ae062076683168c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-behave \
python3.13dist-behave \
python313-behave \
python3dist-behave"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-colorama \
python313-cucumber-expressions \
python313-cucumber-tag-expressions \
python313-parse \
python313-parse-type \
python313-six"

inherit rpm

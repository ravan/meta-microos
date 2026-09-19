SUMMARY = "Tools to work with text"
DESCRIPTION = "This package provides handy routines for dealing with text, such as \
wrapping, substitution, trimming, stripping, prefix and suffix removal, \
line continuation, indentation, comment processing, identifier processing, \
values parsing, case insensitive comparison, and more."
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "python313-jaraco.text-4.3.0-1.1.noarch.rpm"
RPM_HASH = "0358d4055b722fbcdce6e7c526a3da1fe79261d946ca6fb90381eb763a98f708e6fe0405adc66609f726e930ff3897ebdac16309c93a6f3f72cbe38fbd21f3b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.text \
python3.13dist-jaraco.text \
python313-jaraco.text \
python3dist-jaraco.text"

RDEPENDS:${PN} += "python-abi \
python313-autocommand \
python313-inflect \
python313-jaraco.context \
python313-jaraco.functools \
python313-more-itertools \
python313-typer"

inherit rpm

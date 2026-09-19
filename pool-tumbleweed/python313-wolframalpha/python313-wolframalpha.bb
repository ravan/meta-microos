SUMMARY = "WolframAlpha 2.0 API client"
DESCRIPTION = "Python Client built against the Wolfram|Alpha (http://wolframalpha.com) \
v2.0 API."
LICENSE = "MIT"

PV = "5.1.3"

RPM_NAME = "python313-wolframalpha-5.1.3-1.2.noarch.rpm"
RPM_HASH = "f45d81d4a1d584b2bb46f58b590db95031fa36920e428f72666edb75d097750cfcbbcf2827baa734e4730834e026deb50d97e121b351f5465c19fabee5eb3a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wolframalpha \
python3.13dist-wolframalpha \
python313-wolframalpha \
python3dist-wolframalpha"

RDEPENDS:${PN} += "python-abi \
python313-httpx \
python313-jaraco.context \
python313-more-itertools \
python313-multidict \
python313-xmltodict"

inherit rpm

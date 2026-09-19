SUMMARY = "A utility library for mocking out the `requests` Python library"
DESCRIPTION = "A utility library for mocking out the requests Python library. \
Check https://github.com/getsentry/responses for more information \
about the library."
LICENSE = "Apache-2.0"

PV = "0.26.2"

RPM_NAME = "python313-responses-0.26.2-1.1.noarch.rpm"
RPM_HASH = "c419f7be7c93f96679813aa2a32005cc7585aaec2ddf5f15b2967e6660aa5c436220017af6332be9c4953c4f5c10d3538fecb2ce87160c6b0674da9dafefe0ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-responses \
python3.13dist-responses \
python313-responses \
python3dist-responses"

RDEPENDS:${PN} += "-python313-requests >= 2.30.0 with python313-requests < 3 \
-python313-urllib3 >= 1.25.1 with python313-urllib3 < 3 \
python-abi \
python313-PyYAML"

inherit rpm

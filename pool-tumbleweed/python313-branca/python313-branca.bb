SUMMARY = "HTML+JS page generator"
DESCRIPTION = "Generate HTML+JS pages with Python."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python313-branca-0.8.2-1.4.noarch.rpm"
RPM_HASH = "396fd324f4efbb1ec3a155dff9e00a3ea35d7676d03c84d76c4d76eebcc3ee81c9592adf11360f5e3c168299eaea83e336a282a59015348eb21cbfb216dc2b17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-branca \
python3.13dist-branca \
python313-branca \
python3dist-branca"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2"

inherit rpm

SUMMARY = "Jinja2 template renderer for aiohttp.web"
DESCRIPTION = "Jinja2 template renderer for aiohttp.web."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "python313-aiohttp-jinja2-1.6-3.2.noarch.rpm"
RPM_HASH = "296ecada50442f267f645bb6958ad4608b25d52e1c82bbafee0dad8142fe7fa8dc0a820279fe754a300d5c69c5bd59d6a334a300bcc7a9af13619a153581bc8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiohttp-jinja2 \
python3.13dist-aiohttp-jinja2 \
python313-aiohttp-jinja2 \
python3dist-aiohttp-jinja2"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-aiohttp"

inherit rpm

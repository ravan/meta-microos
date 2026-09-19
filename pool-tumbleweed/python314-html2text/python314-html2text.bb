SUMMARY = "Python script for turning HTML into Markdown text"
DESCRIPTION = "html2text is a Python script that converts a page of HTML into \
Markdown (a text-to-HTML format)."
LICENSE = "GPL-3.0-only"

PV = "2025.4.15"

RPM_NAME = "python314-html2text-2025.4.15-1.6.noarch.rpm"
RPM_HASH = "99fe74a4399180d4050e5be70782d35170e781728b9c670d8e53d6984fe29c8464be409d7220269f805ed68a69c989f4de22e0bafb72e59725a85b53bf2217a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "html2text \
python3.14dist-html2text \
python314-html2text \
python3dist-html2text"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm

SUMMARY = "web.py: makes web apps"
DESCRIPTION = "Think about the ideal way to write a web app. Write the code to make it happen."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "0.62"

RPM_NAME = "python313-web.py-0.62-5.5.noarch.rpm"
RPM_HASH = "8a0ec9b488e4bdf7c21e4b52d30b53b09ceec4b58c57209a8f18e50b7f253c33e77899b0848ecae9c78b06cca8056ce615f4016bb98ee3954157175cb870f164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-web.py \
python3.13dist-web.py \
python313-web.py \
python3dist-web.py"

RDEPENDS:${PN} += "python-abi \
python313-cheroot \
python313-legacy-cgi"

inherit rpm

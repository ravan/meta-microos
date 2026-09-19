SUMMARY = "web.py: makes web apps"
DESCRIPTION = "Think about the ideal way to write a web app. Write the code to make it happen."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "0.62"

RPM_NAME = "python314-web.py-0.62-5.5.noarch.rpm"
RPM_HASH = "e1a507900eb54a7062d01d1bfa901e78ff57b0f53744af2dbb5120d5598f627db18378034bc29bd8e5c3dc1ddca8463db5d70c9e3f177b7fcbeb7c10d2c8ac24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-web.py \
python314-web.py \
python3dist-web.py"

RDEPENDS:${PN} += "python-abi \
python314-cheroot \
python314-legacy-cgi"

inherit rpm

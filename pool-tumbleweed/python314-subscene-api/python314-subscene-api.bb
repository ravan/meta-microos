SUMMARY = "Python wrapper for Subscene subtitle database"
DESCRIPTION = "Exposes the Subscene subtitle database API to Python."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python314-subscene-api-2.0.0-3.5.noarch.rpm"
RPM_HASH = "b9c7de317a59ab8b270852c3853861efe4b63d4b9cb6fe8d6423b8535cd0a6ffaaa536e0c0eb90977c5e0134f91f9905c022dc3349f92e5807fcc0ea857f5a0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-subscene-api \
python314-subscene-api \
python3dist-subscene-api"

RDEPENDS:${PN} += "python-abi \
python314-beautifulsoup4"

inherit rpm

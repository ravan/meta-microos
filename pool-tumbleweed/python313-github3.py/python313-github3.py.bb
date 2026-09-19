SUMMARY = "Python wrapper for the GitHub API"
DESCRIPTION = "Github3.py is wrapper for v3 of the GitHub API written in python."
LICENSE = "BSD-3-Clause"

PV = "4.0.1"

RPM_NAME = "python313-github3.py-4.0.1-2.3.noarch.rpm"
RPM_HASH = "dd7155fcf03df3a745b0096dc10c5a2b2663e062bed2db6edcd81fb6e41387c34863cbaf27a9013e907377fbdb1868b9ca48df65db7e22fd85caeedaf80b2b02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-github3.py \
python3.13dist-github3.py \
python313-github3.py \
python3dist-github3.py"

RDEPENDS:${PN} += "python-abi \
python313-PyJWT \
python313-jwcrypto \
python313-python-dateutil \
python313-requests \
python313-uritemplate"

inherit rpm

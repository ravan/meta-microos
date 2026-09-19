SUMMARY = "Django plugin to transparently use webpack"
DESCRIPTION = "webpack can be used to generate static bundles without Django's \
staticfiles or opaque wrappers."
LICENSE = "MIT"

PV = "3.2.4"

RPM_NAME = "python313-django-webpack-loader-3.2.4-1.1.noarch.rpm"
RPM_HASH = "b0b1cf77654d2df42c9f0f2040f186a385470c32b45c4535b8b17575b04738af4898beebc96a8a261036e6d6267eacb36c6dc04929a30feb10bb0b496d9a8152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-webpack-loader \
python3.13dist-django-webpack-loader \
python313-django-webpack-loader \
python3dist-django-webpack-loader"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm

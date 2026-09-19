SUMMARY = "Python wrapper for the internal v2 SoundCloud API"
DESCRIPTION = "Python wrapper for the internal v2 SoundCloud API. Does not require an API key."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python313-soundcloud-v2-1.7.0-1.2.noarch.rpm"
RPM_HASH = "d849b71191b6947129c0d074ee5022686e64da3d0ae4f5a4cca6b44443da628b68df96eddccaf299ed57123e1b9deacdb51b2c3229fa8d6f022a913bd8ef15a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-soundcloud-v2 \
python3.13dist-soundcloud-v2 \
python313-soundcloud-v2 \
python3dist-soundcloud-v2"

RDEPENDS:${PN} += "python-abi \
python313-dacite \
python313-python-dateutil \
python313-requests"

inherit rpm

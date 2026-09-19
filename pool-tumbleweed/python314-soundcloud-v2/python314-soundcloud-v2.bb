SUMMARY = "Python wrapper for the internal v2 SoundCloud API"
DESCRIPTION = "Python wrapper for the internal v2 SoundCloud API. Does not require an API key."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python314-soundcloud-v2-1.7.0-1.2.noarch.rpm"
RPM_HASH = "0eef48c0377af8d2f53a30a5fa5bf3e1b31dbbb3651f85e49026f057c18168cc3a1e73ecb68acdd85fe45977d35e4d2bdbaa3f42211da723b5ad892dfe091dfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-soundcloud-v2 \
python314-soundcloud-v2 \
python3dist-soundcloud-v2"

RDEPENDS:${PN} += "python-abi \
python314-dacite \
python314-python-dateutil \
python314-requests"

inherit rpm

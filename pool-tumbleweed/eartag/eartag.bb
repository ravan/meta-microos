SUMMARY = "Edit audio file tags"
DESCRIPTION = "Ear Tag is a simple audio file tag editor. It is primarily geared towards making quick edits or bulk-editing tracks in albums/EPs. \
Unlike other tagging programs, Ear Tag does not require the user to set up a music library folder."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "eartag-1.0.3-1.1.noarch.rpm"
RPM_HASH = "7ba866dff11d4ee0820177c1d19cf7c131bbc7e70123ac964f9c7a1ae0558403769bacf9940d879e31cf105f0b747b52acc1ea2e0ec21d6c28d768c3b3d98460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eartag"

RDEPENDS:${PN} += "/usr/bin/python3 \
chromaprint-fpcalc \
python3-Pillow \
python3-aiofiles \
python3-aiohttp \
python3-aiohttp-retry \
python3-filetype \
python3-gobject \
python3-mutagen \
python3-pyacoustid \
python3-xxhash"

inherit rpm

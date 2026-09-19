SUMMARY = "A logging replacement for Python"
DESCRIPTION = "An alternative logging implementation for python."
LICENSE = "BSD-3-Clause"

PV = "1.10.1"

RPM_NAME = "python314-Logbook-1.10.1-1.1.aarch64.rpm"
RPM_HASH = "41594ef6bffcb6716fcee552acfbef1fa7fdc12ee621910318beb687b9e3b918344be428c152b1ed8991a6849728669f1d441c54fef5b5202349257891c47c75"

RPROVIDES:${PN} += "python3.14dist-logbook \
python314-Logbook \
python3dist-logbook"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python314-typing-extensions"

inherit rpm

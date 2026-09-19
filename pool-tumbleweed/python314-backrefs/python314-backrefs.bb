SUMMARY = "A wrapper around re and regex that adds additional back references"
DESCRIPTION = "Backrefs is a wrapper around Python's built-in [Re][re] and the 3rd party [Regex][regex] library.  Backrefs adds various \
additional back references (and a couple other features) that are known to some regular expression engines, but not to \
Python's Re and/or Regex.  The supported back references actually vary depending on the regular expression engine being \
used as the engine may already have support for some. \
 \
```python \
from backrefs import bre \
>>> pattern = bre.compile(r'(\\p{Letter}+)') \
>>> pattern.sub(r'\\C\\1\\E', 'sometext') \
'SOMETEXT' \
```"
LICENSE = "MIT"

PV = "7.0"

RPM_NAME = "python314-backrefs-7.0-1.3.noarch.rpm"
RPM_HASH = "cc1c678ad7876321e0cce8313c790e4bdfd77da241a5d9e1e1ac3ad9c0635dbf68923238a0fa58e0fd2baaca63f75d31690d2feecdaa8dd2c9b480b426946604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-backrefs \
python314-backrefs \
python3dist-backrefs"

RDEPENDS:${PN} += "python-abi"

inherit rpm

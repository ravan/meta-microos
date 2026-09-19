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

RPM_NAME = "python313-backrefs-7.0-1.3.noarch.rpm"
RPM_HASH = "9c03b6bb77941d7c410ac527718a9b23e4ac52cfe2397fd23ce8ad14d86c57bdeb9b56b48155c5f7cf231b38a52ea57af388e1a85894686028ba8f98d768fa18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-backrefs \
python3.13dist-backrefs \
python313-backrefs \
python3dist-backrefs"

RDEPENDS:${PN} += "python-abi"

inherit rpm

SUMMARY = "Directory monitoring package for Python"
DESCRIPTION = "Easywatch exports one function, `watch` which watches a directory for \
changes and notifies a handler the type of event and the name of the \
file that triggered it. \
 \
There are four types of events that the handler can be notified about: \
 \
  * created: a file was created \
  * deleted: a file was deleted \
  * modified: a file was modified \
  * moved: a file was moved"
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python314-easywatch-0.0.5-3.5.noarch.rpm"
RPM_HASH = "a64dc788e362d8c64579b9351312385f368aada5b81f2ff7cf10b76cf58a2416d0748843a098a6e09eb2838c4982f7c257d078d84e2f0d620f7615f3f9b89452"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-easywatch \
python314-easywatch \
python3dist-easywatch"

RDEPENDS:${PN} += "python-abi \
python314-watchdog"

inherit rpm

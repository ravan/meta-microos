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

RPM_NAME = "python313-easywatch-0.0.5-3.5.noarch.rpm"
RPM_HASH = "e6e8e454b4e57f6d365148458aa6696a80e66e9bfa400c298f6322baca90cb8d7e56459afb9274e3fd4ff1be149b01da44da1b23fc3bbd2df4692ec16f661e67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-easywatch \
python3.13dist-easywatch \
python313-easywatch \
python3dist-easywatch"

RDEPENDS:${PN} += "python-abi \
python313-watchdog"

inherit rpm

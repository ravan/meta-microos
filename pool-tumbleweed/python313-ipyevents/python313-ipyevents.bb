SUMMARY = "A custom ipython widget for returning mouse and keyboard events"
DESCRIPTION = "ipyevents provides a custom widget for returning mouse and keyboard \
events to Python. Use it to: \
 \
  * add keyboard shortcuts to an existing widget. \
  * react to the user clicking on an image. \
  * install callbacks on arbitrary mouse and keyboard events. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "2.0.4"

RPM_NAME = "python313-ipyevents-2.0.4-1.4.noarch.rpm"
RPM_HASH = "72ce5ce9d763fa1b8be35478c42a4da44d3c05c65d9d91e58e492c96c705e8c7253067babf46306d43b6e1722d31bbb469eda64f4bd30d03f04935d34a25a1db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyevents \
python3.13dist-ipyevents \
python313-ipyevents \
python3dist-ipyevents"

RDEPENDS:${PN} += "jupyter-ipyevents \
python-abi \
python313-ipywidgets"

inherit rpm

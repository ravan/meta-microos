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

RPM_NAME = "python314-ipyevents-2.0.4-1.4.noarch.rpm"
RPM_HASH = "ef711f5089d4e50d1f9fb81531600a5480df1b9e9ea7061be2a832a5903b854bf791efccfe095d729c3e3214384c337da4bfbefd97bbaba99862ce77f9f87a1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ipyevents \
python314-ipyevents \
python3dist-ipyevents"

RDEPENDS:${PN} += "jupyter-ipyevents \
python-abi \
python314-ipywidgets"

inherit rpm

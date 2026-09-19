SUMMARY = "A custom ipython widget for returning mouse and keyboard events"
DESCRIPTION = "ipyevents provides a custom widget for returning mouse and keyboard \
events to Python. Use it to: \
 \
  * add keyboard shortcuts to an existing widget. \
  * react to the user clicking on an image. \
  * install callbacks on arbitrary mouse and keyboard events. \
 \
This package provides the tools and jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "2.0.4"

RPM_NAME = "jupyter-ipyevents-2.0.4-1.4.noarch.rpm"
RPM_HASH = "259e2e887b8382668605318590bc2e2b478f10d00cf1b43e074781eac3e77048b39ea4419a92d60949bb5261a37533d4423260011db1a9e2dbed7a68ebdff66c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyevents"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-ipyevents"

inherit rpm

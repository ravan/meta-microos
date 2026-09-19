SUMMARY = "Vicious plugins for awesome"
DESCRIPTION = "Vicious is a modular widget library for the 'awesome' window manager, \
derived from the 'Wicked' widget library. It has some of the old \
Wicked widget types, a few of them rewritten, and a good number of new \
ones. \
 \
Vicious widget types are a framework for creating your own awesome \
widgets. Vicious contains modules that gather data about your system, \
and a few helper functions that make it easier to register timers, \
suspend widgets and so on. \
 \
For now Vicious doesn't depend on any third party Lua libraries, to \
make it easier to install and use. That means some system utilities \
are used instead, where available: \
 \
  - hddtemp        for the HDD Temperature widget type \
  - alsa-utils     for the Volume widget type \
  - wireless_tools for the Wireless widget type \
  - curl           for widget types accessing network resources"
LICENSE = "GPL-2.0-or-later"

PV = "2.6.0"

RPM_NAME = "awesome-vicious-2.6.0-1.10.noarch.rpm"
RPM_HASH = "b5e907e6268cac456266f40402936a3d5d3629c7c05e72e920f77f7170cb3f33e5c618ea66921fb882b1d53aa8ed0149d1e2bc641c698e61360d1825f31f8567"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "awesome-vicious"

RDEPENDS:${PN} += "awesome"

inherit rpm

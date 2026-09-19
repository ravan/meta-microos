SUMMARY = "Scripts/commands used in the Qtilities organization"
DESCRIPTION = "Scripts/commands used in the Qtilities organization. \
 \
  - qtls-translate: shell script based on lxqt-transupdate plus some additions to update and compile translations. \
 \
  - AppStream.cmake: converts a given string to a freedesktop' desktop entry specification compliant name. \
 \
  - QtAppResources.cmake: configures and installs various application' resources, including translations. \
 \
  - Translate.cmake: modified version of LXQtTranslateTs.cmake merged with LXQtTranslateDesktop.cmake, to work also with Qt6. \
 \
  - TranslateDesktop.pl: Renamed LXQtTranslateDesktopYaml.pl used by Translate.cmake."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "qtilitools-0.1.2-1.9.noarch.rpm"
RPM_HASH = "922ccca86af28b07e32cee517638870dbcca3f2988b8e42826f589ec570456bba7d1e550ac8021d32194d91e6ef1c6335c8380aae5adc2be7b0c88dbe62207dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-Qtilitools \
qtilitools"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

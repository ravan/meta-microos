SUMMARY = "Web-Hook server for pagure"
DESCRIPTION = "Pagure comes with an webhook server allowing http callbacks for any action \
done on a project. This package provides it."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "pagure-webhook-5.14.1-3.3.noarch.rpm"
RPM_HASH = "ebc800d452be5604bd9a57ad00cb5c887884844a66475ce2a24887d1f2c9488e3f4669192c06dde21404319239c6a8a2edf0fcaf08161a4069c542b3dbf3631a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-webhook"

RDEPENDS:${PN} += "/usr/bin/sh \
pagure \
systemd"

inherit rpm

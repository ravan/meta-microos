SUMMARY = "CLI/Terminal based gemini browser"
DESCRIPTION = "A fancy terminal browser for the Gemini protocol."
LICENSE = "GPL-3.0-only"

PV = "1.11.0"

RPM_NAME = "amfora-1.11.0-4.1.aarch64.rpm"
RPM_HASH = "c9b445b5b625e9d41c56b6328b1ebab8a64cbc8d58e856b2fa77337b9cef209897c48f1330b46885ca6340dba7e02ecf911c68f372425cbc7a4b4adb76f1532c"

RPROVIDES:${PN} += "amfora"

RDEPENDS:${PN} += ""

inherit rpm

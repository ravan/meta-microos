SUMMARY = "Microsoft Application Insights for Python"
DESCRIPTION = "This project extends the Application Insights API surface to support Python. \
 \
Application Insights is a service that allows developers to keep their \
application available, performing and succeeding. This Python module will \
allow you to send telemetry of various kinds (event, trace, exception, etc.) \
to the Application Insights service where they can be visualized in the \
Azure Portal."
LICENSE = "MIT"

PV = "0.11.10"

RPM_NAME = "python313-applicationinsights-0.11.10-4.9.noarch.rpm"
RPM_HASH = "26371f963abaa8e5ae8e428834ff5d4481ec0279dea6b892a545947b492b3c560afc8fbc2ba8a3c5f939c0f3e4cd3e56d88ef6a21219ae69d947b7401c2013ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-applicationinsights \
python3.13dist-applicationinsights \
python313-applicationinsights \
python3dist-applicationinsights"

RDEPENDS:${PN} += "python-abi"

inherit rpm

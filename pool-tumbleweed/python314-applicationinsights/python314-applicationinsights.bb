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

RPM_NAME = "python314-applicationinsights-0.11.10-4.9.noarch.rpm"
RPM_HASH = "4b72524ca52eff96974ea6c888e3f82e67364d828e110de899cc64e9381898a4aa1980fe2c2b9a56a2a37bfb817252a81752eab2a2f512d21439a22219c040ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-applicationinsights \
python314-applicationinsights \
python3dist-applicationinsights"

RDEPENDS:${PN} += "python-abi"

inherit rpm

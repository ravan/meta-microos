SUMMARY = "Azure Core Tracing OpenCensus client library for Python"
DESCRIPTION = "Azure Core Tracing OpenCensus client library for Python"
LICENSE = "MIT"

PV = "1.0.0b10"

RPM_NAME = "python313-azure-core-tracing-opencensus-1.0.0b10-1.8.noarch.rpm"
RPM_HASH = "59d28262e73692df3f30e67e94a401f7eb2aa5c9e77d424b58f9386510597edd669ca6b43e16c980ec22f30d785967598a9579d1f645ed6d0b45f0378980029b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-core-tracing-opencensus \
python3.13dist-azure-core-tracing-opencensus \
python313-azure-core-tracing-opencensus \
python3dist-azure-core-tracing-opencensus"

RDEPENDS:${PN} += "-python313-azure-core >= 1.13.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-opencensus \
python313-opencensus-ext-azure \
python313-opencensus-ext-threading"

inherit rpm

SUMMARY = "Microsoft Azure Video Analyzer Edge SDK Library for Python"
DESCRIPTION = "Azure Video Analyzer provides a platform to build intelligent video applications that span the edge and \
the cloud. The platform offers the capability to capture, record, and analyze live video along with \
publishing the results, video and video analytics, to Azure services in the cloud or the edge. It is \
designed to be an extensible platform, enabling you to connect different video analysis edge modules \
(such as Cognitive services containers, custom edge modules built by you with open-source machine \
 learning models or custom models trained with your own data) to it and use them to analyze live video \
without worrying about the complexity of building and running a live video pipeline. \
 \
Use the client library for Video Analyzer Edge to: \
 \
* Simplify interactions with the Microsoft Azure IoT SDKs \
* Programmatically construct pipeline topologies and live pipelines"
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python313-azure-media-videoanalyzer-edge-1.0.0b4-3.9.noarch.rpm"
RPM_HASH = "2bb4de2918e548d7f85af64256d52e4cab9c548e891f9ecc2158a898696f3be3f8f31efe8656408d1bd3a5ac5e984f3ccc80074452191beb7a0e097301a8a6d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-media-videoanalyzer-edge \
python3.13dist-azure-media-videoanalyzer-edge \
python313-azure-media-videoanalyzer-edge \
python3dist-azure-media-videoanalyzer-edge"

RDEPENDS:${PN} += "-python313-azure-core >= 1.2.2 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-media-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm

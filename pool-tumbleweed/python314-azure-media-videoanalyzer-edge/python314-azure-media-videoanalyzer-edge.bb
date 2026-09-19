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

RPM_NAME = "python314-azure-media-videoanalyzer-edge-1.0.0b4-3.9.noarch.rpm"
RPM_HASH = "02ec3bf59c670205032b6c70fcbc98a99f0261095ce8b01e182de5f6d30dcb9ec094e4285ba52ada4240e7a317fcb93cc91c66a7bbe755310a2ae3ed712fdeed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-media-videoanalyzer-edge \
python314-azure-media-videoanalyzer-edge \
python3dist-azure-media-videoanalyzer-edge"

RDEPENDS:${PN} += "-python314-azure-core >= 1.2.2 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-media-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm

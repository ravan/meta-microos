SUMMARY = "An interactive Kubernetes log viewer for your terminal"
DESCRIPTION = "An interactive Kubernetes log viewer for your terminal. \
 \
* View logs across multiple containers, pods, namespaces, and clusters \
* Select containers interactively or auto-select by pattern matching against \
  names, labels, and more \
* See cluster changes in real time \
* Navigate logs from multiple containers interleaved by timestamp \
* Search logs by exact string or regex pattern. Show or hide surrounding \
  context \
* Zoom in and flip through single formatted logs one by one \
* Archive and share: save logs to a local file or copy a log to your clipboard"
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "kl-0.9.1-1.4.aarch64.rpm"
RPM_HASH = "2148bbdf5f82a43386f678472ee1407575d0f7ade7123e8ec054d55dc5150a650a5c90daf74174127a263b27feaa023874050adb3ab0b9a69e4c125bc4f450f5"

RPROVIDES:${PN} += "kl"

RDEPENDS:${PN} += ""

inherit rpm

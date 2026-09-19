SUMMARY = "Network, Service & Security Observability for Kubernetes using eBPF"
DESCRIPTION = "Hubble is a fully distributed networking and security observability platform \
for cloud native workloads. It is built on top of Cilium and eBPF to enable \
deep visibility into the communication and behavior of services as well as the \
networking infrastructure in a completely transparent manner. \
 \
Hubble can answer questions such as: \
  * Service dependencies & communication map: \
    - What services are communicating with each other? How frequently? What \
      does the service dependency graph look like? \
    - What HTTP calls are being made? What Kafka topics does a service consume \
      from or produce to? \
  * Operational monitoring & alerting: \
    - Is any network communication failing? Why is communication failing? Is it \
      DNS? Is it an application or network problem? Is the communication broken \
      on layer 4 (TCP) or layer 7 (HTTP)? \
    - Which services have experienced a DNS resolution problems in the last 5 \
      minutes? Which services have experienced an interrupted TCP connection \
      recently or have seen connections timing out? What is the rate of unanswered \
      TCP SYN requests? \
  * Application monitoring: \
    - What is the rate of 5xx or 4xx HTTP response codes for a particular \
      service or across all clusters? \
    - What is the 95th and 99th percentile latency between HTTP requests and \
      responses in my cluster? Which services are performing the worst? What is \
      the latency between two services? \
  * Security observability: \
    - Which services had connections blocked due to network policy? What \
      services have been accessed from outside the cluster? Which services have \
      resolved a particular DNS name?"
LICENSE = "Apache-2.0"

PV = "1.19.4"

RPM_NAME = "hubble-1.19.4-1.4.aarch64.rpm"
RPM_HASH = "7531b808fc58d80305957adaa6481109f7cf03bb93afeeefd18ec54b732ee5918d3bcd593acac2da4d5a2e3d666fc1664152371535791d2717a63b6846a14302"

RPROVIDES:${PN} += "hubble"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

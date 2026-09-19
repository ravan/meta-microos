SUMMARY = "Modern load testing tool, using Go and JavaScript"
DESCRIPTION = "k6 is a modern load-testing tool, built on our years of experience in the \
performance and testing industries. It's built to be powerful, extensible, and \
full-featured. The key design goal is to provide the best developer experience. \
 \
Its core features are: \
 \
- Configurable load generation. Even lower-end machines can simulate lots of \
  traffic. \
- Tests as code. Reuse scripts, modularize logic, version control, and \
  integrate tests with your CI. \
- A full-featured API. The scripting API is packed with features that help you \
  simulate real application traffic. \
- An embedded JavaScript engine. The performance of Go, the scripting \
  familiarity of JavaScript. \
- Multiple Protocol support. HTTP, WebSockets, gRPC, Browser, and more. \
- Large extension ecosystem. You can extend k6 to support your needs. And many \
  people have already shared their extensions with the community! \
- Flexible metrics storage and visualization. Summary statistics or granular \
  metrics, exported to the service of your choice. \
- Native integration with Grafana cloud. SaaS solution for test execution, \
  metrics correlation, data analysis, and more. \
 \
This is what load testing looks like in the 21st century."
LICENSE = "AGPL-3.0"

PV = "2.1.0"

RPM_NAME = "k6-2.1.0-1.3.aarch64.rpm"
RPM_HASH = "5c582658e42370fddf489e65c6b3270bd2e1cdf3bc690f21f2ebb285ef3c01629366ffe2156b46067a8219700544df370ecdb767293c79792b128ce155450a4e"

RPROVIDES:${PN} += "k6"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

SUMMARY = "MCP server to communicate with DAP servers"
DESCRIPTION = " \
A Model Context Protocol (MCP) server that provides debugging capabilities through the \
Debug Adapter Protocol (DAP). This server enables AI assistants and other MCP clients \
to interact with debuggers for various programming languages. \
 \
The MCP DAP Server acts as a bridge between MCP clients and DAP-compatible debuggers, \
allowing programmatic control of debugging sessions. It provides a comprehensive set \
of debugging tools that can be used to: \
 \
- Start and stop debugging sessions \
- Set breakpoints (line-based and function-based) \
- Control program execution (continue, step in/out/over, pause) \
- Inspect program state (threads, stack traces, variables, scopes) \
- Evaluate expressions \
- Attach to running processes \
- Handle exceptions"
LICENSE = "MIT"

PV = "0.0.0+git20250722.f375340"

RPM_NAME = "mcp-dap-server-0.0.0+git20250722.f375340-1.6.aarch64.rpm"
RPM_HASH = "ce2257aa0376fbd2713408c05ffe12d9f2575e955d1fd92374bca396d1b25f13f35b67ef822b4a70445f664cb5c9208a38d547c53e5619ca05ab7dffa60100bc"

RPROVIDES:${PN} += "mcp-dap-server"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

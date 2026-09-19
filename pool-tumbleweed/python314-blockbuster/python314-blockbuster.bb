SUMMARY = "Utility to detect blocking calls in the async event loop"
DESCRIPTION = "Blockbuster is a Python package designed to detect and prevent blocking calls within an asynchronous event loop. \
It is particularly useful when executing tests to ensure that your asynchronous code does not inadvertently call blocking operations, \
which can lead to performance bottlenecks and unpredictable behavior. \
 \
In Python, the asynchronous event loop allows for concurrent execution of tasks without the need for multiple threads or processes. \
This is achieved by running tasks cooperatively, where tasks yield control back to the event loop when they are waiting for I/O operations or other long-running tasks to complete. \
 \
However, blocking calls, such as file I/O operations or certain networking operations, can halt the entire event loop, preventing other tasks from running. \
This can lead to increased latency and reduced performance, defeating the purpose of using asynchronous programming. \
 \
The difficulty with blocking calls is that they are not always obvious, especially when working with third-party libraries or legacy code. \
This is where Blockbuster comes in: it helps you identify and eliminate blocking calls in your codebase during testing, ensuring that your asynchronous code runs smoothly and efficiently. \
It does this by wrapping common blocking functions and raising an exception when they are called within an asynchronous context. \
 \
Notes: \
- Blockbuster currently only detects `asyncio` event loops. \
- Blockbuster is tested only with CPython. It may work with other Python implementations if it's possible to monkey-patch the functions with `setattr`."
LICENSE = "Apache-2.0"

PV = "1.5.26"

RPM_NAME = "python314-blockbuster-1.5.26-3.1.noarch.rpm"
RPM_HASH = "cfa408c66254526ca048e339bf254611016f06b4a459ca779df3376ab1392e7bfae924f187a084a7162f5ca45c6ac56526b648d584c81102c9e42d4d72cb4df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-blockbuster \
python314-blockbuster \
python3dist-blockbuster"

RDEPENDS:${PN} += "python-abi \
python314-forbiddenfruit"

inherit rpm
